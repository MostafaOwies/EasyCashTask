package com.islam.easycashtask.model.competition

import com.islam.easycashtask.model.ApiMapper
import javax.inject.Inject

class ApiJobOrderDetailsMapper @Inject constructor() : ApiMapper<ApiDailyJobOrders, DailyJobOrders> {

    override fun mapToDomain(apiEntity: ApiDailyJobOrders): DailyJobOrders {
        val (message, data) = apiEntity

        return DailyJobOrders(
            message = message.orEmpty(),
            nextJobOrder = if (data?.nextJobOrder != null) mapJopOrder(data.nextJobOrder) else null,
            notConfirmedCustomers = data?.notConfirmedCustomers?.map {
                mapJopOrder(it)
            }.orEmpty()
        )
    }

    private fun mapJopOrder(apiJobOrder: ApiJobOrder?): JobOrder {
        return JobOrder(
            isTrustLocation = apiJobOrder?.isTrustLocation ?: false,
            customerAraName = apiJobOrder?.customerAraName.orEmpty(),
            areaAraName = apiJobOrder?.areaAraName.orEmpty(),
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
            webStatus = apiJobOrder?.webStatus.orEmpty(),
            specificCustomer = apiJobOrder?.specificCustomer.orEmpty(),
            distdayDetFromhr = apiJobOrder?.distdayDetFromhr.orEmpty(),
            location = apiJobOrder?.location.orEmpty(),
            date = apiJobOrder?.date.orEmpty(),
            address = apiJobOrder?.address.orEmpty(),
            locationActive = Location(
                lat = apiJobOrder?.locationsActive?.lat?.toDouble() ?: 0.0,
                long = apiJobOrder?.locationsActive?.lng?.toDouble() ?: 0.0,
//                status = parseLocationStatus(apiJobOrder?.locationsActive?.status)
            )
        )
    }
}