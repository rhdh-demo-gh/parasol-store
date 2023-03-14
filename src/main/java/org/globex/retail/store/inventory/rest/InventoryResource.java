package org.globex.retail.store.inventory.rest;

import io.smallrye.mutiny.Uni;
import io.smallrye.mutiny.infrastructure.Infrastructure;
import org.globex.retail.store.inventory.service.InventoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/services/inventory")
public class InventoryResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(InventoryResource.class);

    @Inject
    InventoryService inventoryService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Response> getAll() {
        return Uni.createFrom().item(() -> null).emitOn(Infrastructure.getDefaultWorkerPool())
                .onItem().transform(o -> inventoryService.findAll())
                .onItem().transform(l -> Response.ok(l).build())
                .onFailure().recoverWithItem(throwable -> {
                    LOGGER.error("Exception while fetching inventory", throwable);
                    return Response.serverError().build();
                });
    }

    @GET
    @Path("/{itemId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Response> getInventoryByItemId(@PathParam("itemId") String itemId) {
        return Uni.createFrom().item(() -> itemId).emitOn(Infrastructure.getDefaultWorkerPool())
                .onItem().transform(i -> inventoryService.findByItemId(i))
                .onItem().transform(l -> Response.ok(l).build())
                .onFailure().recoverWithItem(throwable -> {
                    LOGGER.error("Exception while fetching inventory", throwable);
                    return Response.serverError().build();
                });
    }
}
