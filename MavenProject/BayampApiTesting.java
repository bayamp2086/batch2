package com.bayamp.trainning.junebatch.apachehttp.tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
//import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.testng.annotations.Test;

public class BayampApiTesting {
	@Test(priority = 1, groups = "positive", description = "Positive test senario : checking the get status and retrieving the data")
	public void httpGetMethod() throws ClientProtocolException, IOException {
		String endPoint = "https://bayamprestapp.herokuapp.com/bayamp/engineers/";
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(endPoint);
		// request.addHeader("name","Bayamp");

		HttpResponse response = client.execute(request);
		int responseCode = response.getStatusLine().getStatusCode();
		System.out.println("The status code is" + responseCode);
		Assert.assertEquals(/* expected status code */ 200, /* actual response we got */ responseCode);

		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
			System.out.println(result);
		}

	}

	@Test
	public void httpPostMethod() throws ClientProtocolException, IOException {
		String endPoint = "https://bayamprestapp.herokuapp.com/bayamp/create/";
		HttpClient client = new DefaultHttpClient();
		// HttpClient client=HttpClientBuilder.create().build();
		HttpPost requestPost = new HttpPost(endPoint);

		List<NameValuePair> nameOfEngineers = new ArrayList<NameValuePair>(1);
		nameOfEngineers.add(new BasicNameValuePair("name", "GhanaShyam Pandey"));
		requestPost.setEntity(new UrlEncodedFormEntity(nameOfEngineers));

		HttpResponse response = client.execute(requestPost);
		int responseCode = response.getStatusLine().getStatusCode();
		System.out.println("Response Code : " + response.getStatusLine().getStatusCode());

		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
			System.out.println(result);
			String strresult1 = result.toString();
			System.out.println(strresult1);
			Assert.assertEquals(201, responseCode);
			// Assert.assertTrue(result.contains("GhanaShyam Pandey"));

		}
	}

	@Test
	public void httpDeleteMethod() throws ClientProtocolException, IOException {
		String endPoint = "https://bayamprestapp.herokuapp.com/bayamp/delete/NyKdsv6il";
		HttpClient client = HttpClientBuilder.create().build();
		HttpDelete request = new HttpDelete(endPoint);
		// request.addHeader("name","Bayamp");

		HttpResponse response = client.execute(request);
		int responseCode = response.getStatusLine().getStatusCode();
		System.out.println("The status code for delete method  is" + responseCode);
		Assert.assertEquals(responseCode, 204);
	}

	@Test
	public void checkDeleteMethod() throws ClientProtocolException, IOException {
		String endPoint = "https://bayamprestapp.herokuapp.com/bayamp/engineers/NyKdsv6il";
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(endPoint);
		// request.addHeader("name","Bayamp");

		HttpResponse response = client.execute(request);
		int responseCode = response.getStatusLine().getStatusCode();
		System.out.println("The status code for get to verify del method is" + responseCode);
		Assert.assertEquals(503, responseCode);
	}

	@Test
	public void checkFor404Error() throws ClientProtocolException, IOException {
		String endPoint = "https://bayamprestapp.herokuapp.com/bayamp/engineerss";
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(endPoint);
		HttpResponse response = client.execute(request);
		int responseCode = response.getStatusLine().getStatusCode();
		System.out.println("The status code for to verify 404 code response is" + responseCode);
		Assert.assertEquals(404, responseCode);
	}
}
