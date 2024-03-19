package com.islam.easycashtask.model.competition

import com.islam.easycashtask.model.ApiMapper
import javax.inject.Inject

/*
class ApiCustomerLocationsMapper @Inject constructor() :
    ApiMapper<ApiCustomersLocationsResponse, CustomersLocationResponse> {

    override fun mapToDomain(apiEntity: ApiCustomersLocationsResponse): CustomersLocationResponse {
        val (message, data) = apiEntity

        return CustomersLocationResponse(
            message = message.orEmpty(),
            customers = data?.map {
                mapCustomerLocation(it)
            }.orEmpty()
        )
    }

    private fun mapCustomerLocation(apiJobOrder: ApiCustomerLocationData?): CustomerLocationData {
        return CustomerLocationData(
            customerAraName = apiJobOrder?.customerAraName.orEmpty(),
            service = apiJobOrder?.service.orEmpty(),
            customerId = apiJobOrder?.customerId.orEmpty(),
            processId = apiJobOrder?.processId.orEmpty(),
            transCode = apiJobOrder?.transCode.orEmpty(),
            isCollecting = apiJobOrder?.isCollecting.orEmpty(),
            collectAddress = apiJobOrder?.collectAddress.orEmpty(),
            installAddress = apiJobOrder?.installAddress.orEmpty(),
            serial = apiJobOrder?.serial.orEmpty(),
            transYear = apiJobOrder?.transYear.orEmpty(),
            hourSort = apiJobOrder?.hourSort.orEmpty(),
            hour = apiJobOrder?.hour.orEmpty(),
            technical = apiJobOrder?.technical.orEmpty(),
            webIsSort = apiJobOrder?.webIsSort.orEmpty(),
            webSort = apiJobOrder?.webSort.orEmpty(),
            distdayDetFromhr = apiJobOrder?.distdayDetFromhr.orEmpty(),
            location = apiJobOrder?.location.orEmpty(),
            date = apiJobOrder?.date.orEmpty(),
            address = apiJobOrder?.address.orEmpty(),
            locationActive = Location(
                lat = apiJobOrder?.locationsActive?.lat ?: 0.0,
                long = apiJobOrder?.locationsActive?.lng ?: 0.0,
//                status = parseLocationStatus(apiJobOrder?.locationsActive?.status)
            )
        )
    }
}*/
