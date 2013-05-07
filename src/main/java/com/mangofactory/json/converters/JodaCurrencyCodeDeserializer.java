package com.mangofactory.json.converters;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.joda.money.CurrencyUnit;

public class JodaCurrencyCodeDeserializer extends JsonDeserializer<CurrencyUnit> {

	@Override
	public CurrencyUnit deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		return CurrencyUnit.of(jp.getText());
	}

}
