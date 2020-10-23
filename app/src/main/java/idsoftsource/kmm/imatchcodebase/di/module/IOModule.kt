package idsoftsource.kmm.imatchcodebase.di.module;

import com.google.gson.GsonBuilder
import dagger.Provides
import idsoftsource.kmm.data.EndPoint
import idsoftsource.kmm.data.Endpoint
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.Boolean
import javax.inject.Singleton

class IOModule {
    private val endpoint: EndPoint

    init {
        val okHttpBuilder = OkHttpClient.Builder()

        if (BuildConfig.BUILD_TYPE == "debug") {
            okHttpBuilder.addInterceptor { chain ->
                println(chain.request())
                chain.proceed(chain.request())
            }
        }

        val okHttpClient = okHttpBuilder.build()

        val gson = GsonBuilder().create()

        val retrofit = Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(gson))
            .baseUrl(BuildConfig.ENDPOINT)
            .client(okHttpClient)
            .build()

        endpoint = retrofit.create(Endpoint::class.java)
    }

    @Provides
    @Singleton
    internal fun provideEndpoint(): EndPoint = endpoint
}


