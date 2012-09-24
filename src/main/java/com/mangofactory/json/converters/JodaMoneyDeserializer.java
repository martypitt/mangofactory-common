package com.mangofactory.json.converters;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.joda.money.Money;

public class JodaMoneyDeserializer extends JsonDeserializer<Money> {

	@Override
	public Money deserialize(JsonParser parser, DeserializationContext context)
			throws IOException, JsonProcessingException {
		String text = parser.getText();
		return Money.parse(text);
	}
}
