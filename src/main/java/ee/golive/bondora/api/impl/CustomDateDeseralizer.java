package ee.golive.bondora.api.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomDateDeseralizer extends JsonDeserializer<Date> {

    @Override
    public Date deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        try {
            return parseDate(jp.getText(), new String[]{
                    "yyyy-MM-dd'T'HH:mm:ss.SSSZ",
                    "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'",
                    "EEE, dd MMM yyyy HH:mm:ss zzz",
                    "yyyy-MM-dd",
                    "yyyy-MM-dd'T'HH:mm:ss.SSSSSSS'Z"
            });
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }

    private Date parseDate(String date, String[] formats) throws Exception {
        for(String format : formats) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
                return simpleDateFormat.parse(date);
            } catch (ParseException ignored) {

            }
        }
        throw new Exception("Format not found!");
    }
}