package br.com.example.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H&\u00a8\u0006\b"}, d2 = {"Lbr/com/example/network/FakeService;", "", "getSomething", "Lio/reactivex/Single;", "Lretrofit2/Response;", "Lbr/com/example/network/DumbResponse;", "getSomethingWithoutBody", "Ljava/lang/Void;", "network_debug"})
public abstract interface FakeService {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<retrofit2.Response<br.com.example.network.DumbResponse>> getSomething();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<retrofit2.Response<java.lang.Void>> getSomethingWithoutBody();
}