package com.mangofactory.json.converters;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.joda.money.Money;

public class JodaMoneySerializer extends JsonSerializer<Money> {

	@Override
	public void serialize(Money value, JsonGenerator generator,
			SerializerProvider arg2) throws IOException,
			JsonProcessingException {
		generator.writeString(value.toString());
	}

}
