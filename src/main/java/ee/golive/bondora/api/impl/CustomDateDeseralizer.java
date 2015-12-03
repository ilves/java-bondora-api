/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ee.golive.bondora.api.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Taavi Ilves, Golive O�, http://www.golive.ee/
 */
public class CustomDateDeseralizer extends JsonDeserializer<Date> {

    @Override
    public Date deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
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