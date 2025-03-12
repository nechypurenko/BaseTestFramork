package com.utils;

import com.framework.utils.TestDataUtil;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestDataProvider {

    @DataProvider(name = "TestData")
    public static Iterator<Object[]> unixTestData() throws IOException {
        String fileTestData = "src/test/resources/testdata/testData.json";
        JsonArray testDataArray = TestDataUtil.getTestDataArray(fileTestData);
        List<Object[]> dataList = new ArrayList<>();

        for (JsonElement element : testDataArray) {
            JsonObject data = element.getAsJsonObject();
            dataList.add(new Object[]{
                    data.get("category").getAsString(),
                    data.get("subCategory").getAsString(),
                    data.get("expectedTitle").getAsString()
            });
        }

        return dataList.iterator();
    }
}
