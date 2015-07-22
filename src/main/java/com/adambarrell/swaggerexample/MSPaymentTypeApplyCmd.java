package com.adambarrell.swaggerexample;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.swagger.annotations.*;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("MSPaymentTypeApplyCmd")
@Api(value = "MSPaymentTypeApplyCmd")
@Produces("application/json")
public class MSPaymentTypeApplyCmd {


    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Vouchers applied successfully.", response = PrePaidResponse.class)
    })
    @ApiOperation(
            value    = "Apply reward vouchers.",
            notes    = "Applies multiple reward vouchers to the checkout session.",
            response = PrePaidResponse.class
    )
    @POST
    @Produces("application/json")
    public Response applyPaymentType(
            @ApiParam(allowMultiple = true) @FormParam("Addvoucher[]")  List<String> vouchers,
            @FormParam("action")       String action,
            @FormParam("storeId")      String storeId,
            @FormParam("langId")       String langId,
            @FormParam("resJSON")      Boolean resJSON
    ) {

        PrePaidResponse mockResponse = new PrePaidResponse();
        Gson gson = new GsonBuilder().create();

        return Response
                .ok(gson.toJson(mockResponse))
                .build();
    }
}