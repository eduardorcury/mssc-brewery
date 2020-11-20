package com.erc.msscbrewery.web.mappers;

import com.erc.msscbrewery.domain.Beer;
import com.erc.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);

}
