package com.theboss.jackli.tripbuddy.networking;

import com.theboss.jackli.tripbuddy.model.TripAdvisorLocation;
import com.theboss.jackli.tripbuddy.model.pojo.Datum;
import com.theboss.jackli.tripbuddy.model.pojo.TripAdvisorResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by yucunli on 2016-02-20.
 */
public class TripAdvisorService {
    public static final String API_URL = "http://api.tripadvisor.com/api/partner/2.0/";
    public static final String TOKEN = "0E3224EDD1664C52893AC703E5288EAF";

    public interface TripAdvisor {
        @GET("location/{location_id}/attractions?key="+TOKEN)
        Call<TripAdvisorResponse> responses(@Path("location_id") String location_id);
    }

    public static List<TripAdvisorLocation> getCityTopList(int city) throws IOException {
        List<TripAdvisorLocation> result = new ArrayList<TripAdvisorLocation>(10);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TripAdvisor tripAdvisor = retrofit.create(TripAdvisor.class);

        Call<TripAdvisorResponse> response = tripAdvisor.responses("155019");
        TripAdvisorResponse tripAdvisorResponse = response.execute().body();

        for(Datum datum : tripAdvisorResponse.getData()) {
            TripAdvisorLocation tal = new TripAdvisorLocation(datum.getLocation_id(), datum.getName());
            result.add(tal);
        }

        return result;
    }

}
