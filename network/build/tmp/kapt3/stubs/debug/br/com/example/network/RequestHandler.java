package br.com.example.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\u0018\u0000 \u001f*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001fB\u001f\b\u0002\u0012\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0006J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004J\u0010\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\bJ\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u001c\u001a\u00020\u001d\"\u00020\fJ\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u001c\u001a\u00020\u001d\"\u00020\fR\u0018\u0010\u0007\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\r\u00a8\u0006 "}, d2 = {"Lbr/com/example/network/RequestHandler;", "T", "", "request", "Lio/reactivex/Single;", "Lretrofit2/Response;", "(Lio/reactivex/Single;)V", "errorBody", "Lkotlin/reflect/KClass;", "", "errorCodes", "", "", "[Ljava/lang/Integer;", "handler", "Lbr/com/example/network/RestfulRequestUnwrapper;", "getHandler", "()Lbr/com/example/network/RestfulRequestUnwrapper;", "handler$delegate", "Lkotlin/Lazy;", "successCodes", "makeRequest", "Lio/reactivex/Completable;", "emptyBody", "", "withCustomErrorBody", "body", "withErrorCodes", "codes", "", "withSuccessCodes", "Companion", "network_debug"})
public final class RequestHandler<T extends java.lang.Object> {
    private final io.reactivex.Single<retrofit2.Response<T>> request = null;
    private java.lang.Integer[] successCodes;
    private java.lang.Integer[] errorCodes;
    private kotlin.reflect.KClass<? extends java.lang.Throwable> errorBody;
    private final kotlin.Lazy handler$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final br.com.example.network.RequestHandler.Companion Companion = null;
    
    private RequestHandler(io.reactivex.Single<retrofit2.Response<T>> request) {
        super();
    }
    
    private final br.com.example.network.RestfulRequestUnwrapper getHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.example.network.RequestHandler<T> withSuccessCodes(@org.jetbrains.annotations.NotNull()
    int... codes) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.example.network.RequestHandler<T> withErrorCodes(@org.jetbrains.annotations.NotNull()
    int... codes) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.example.network.RequestHandler<T> withCustomErrorBody(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KClass<? extends java.lang.Throwable> body) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<T> makeRequest() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable makeRequest(boolean emptyBody) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final <T extends java.lang.Object>br.com.example.network.RequestHandler<T> create(@org.jetbrains.annotations.Nullable()
    io.reactivex.Single<retrofit2.Response<T>> request) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\b\u0018\u00010\u0007H\u0007\u00a8\u0006\t"}, d2 = {"Lbr/com/example/network/RequestHandler$Companion;", "", "()V", "create", "Lbr/com/example/network/RequestHandler;", "T", "request", "Lio/reactivex/Single;", "Lretrofit2/Response;", "network_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final <T extends java.lang.Object>br.com.example.network.RequestHandler<T> create(@org.jetbrains.annotations.Nullable()
        io.reactivex.Single<retrofit2.Response<T>> request) {
            return null;
        }
    }
}