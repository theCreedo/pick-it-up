package com.example.ty.pickitup;

import android.graphics.Bitmap;
import android.net.Uri;

import com.google.gson.Gson;
import com.microsoft.projectoxford.vision.VisionServiceClient;
import com.microsoft.projectoxford.vision.VisionServiceRestClient;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;


/**
 * Created by Ty on 4/22/2017.
 */

public class Vision {

    private Uri mImageUri;
    private Bitmap mBitmap;
    private VisionServiceClient client;
    public void request_vision() {
        client = new VisionServiceRestClient("8755aa9f415c4b2cb0b5f2f3fcd53fa7");
    }

    public static void getLabels(Bitmap mBitmap) {
        Gson gson = new Gson();
        String[] features = {"ImageType", "Categories", "Faces"};
        String[] details = {};
        // Put the image into an input stream for detection.
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        mBitmap.compress(Bitmap.CompressFormat.JPEG, 100, output);
        ByteArrayInputStream inputStream = new ByteArrayInputStream(output.toByteArray());

        AnalysisResult v = this.client.analyzeImage(inputStream, features, details);

        String result = gson.toJson(v);
    }
    /*
        try
        {
            Uri.Builder b = Uri.parse("https://westus.api.cognitive.microsoft.com/vision/v1.0/analyze").buildUpon();
            b.appendQueryParameter("visualFeatures", "Categories");
            b.appendQueryParameter("details", "Celebrities");
            b.appendQueryParameter("language", "en");
            Uri uri = b.build();
            HttpURLConnection urlConnection = (HttpURLConnection)  new URL(uri.toString()).openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setRequestProperty("Content-Type", "application/json");
            urlConnection.setRequestProperty("Ocp-Apim-Subscription-Key", "8755aa9f415c4b2cb0b5f2f3fcd53fa7");
            /*
            // Request headers - replace this example key with your valid subscription key.
            request.setHeader("Content-Type", "application/json");
            request.setHeader("Ocp-Apim-Subscription-Key", "13hc77781f7e4b19b5fcdd72a8df7156");

            // Request body. Replace the example URL with the URL for the JPEG image of a celebrity.
            StringEntity reqEntity = new StringEntity("{\"url\":\"http://example.com/images/test.jpg\"}");
            request.setEntity(reqEntity);

            HttpResponse response = httpclient.execute(request);
            HttpEntity entity = response.getEntity();

            if (entity != null)
            {
                System.out.println(EntityUtils.toString(entity));
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }*/

}
