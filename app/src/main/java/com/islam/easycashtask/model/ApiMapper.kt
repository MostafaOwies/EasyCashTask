package com.islam.easycashtask.model

interface ApiMapper<E, D> {
  fun mapToDomain(apiEntity: E): D
}
