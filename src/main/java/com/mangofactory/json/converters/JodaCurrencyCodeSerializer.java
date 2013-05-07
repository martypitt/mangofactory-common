package com.mangofactory.json.converters;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.joda.money.CurrencyUnit;

public class JodaCurrencyCodeSerializer extends JsonSerializer<CurrencyUnit> {

	@Override
	public void serialize(CurrencyUnit value, JsonGenerator jgen,
			SerializerProvider provider) throws IOException,
			JsonProcessingException {
		jgen.writeString(value.getCurrencyCode());
	}

}
