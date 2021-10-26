package br.com.example.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002Ja\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\n\u0018\u00010\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\u0012\b\u0002\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0010\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0011J[\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\b2\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\n\u0018\u00010\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\u0012\b\u0002\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0010\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0014J!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0002\u00a2\u0006\u0002\u0010\u0018J.\u0010\u0019\u001a\u0004\u0018\u00010\u0010\"\u0004\b\u0000\u0010\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000fH\u0002J&\u0010\u001c\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\n0\u001d\"\u0004\b\u0000\u0010\bH\u0002JV\u0010\u001e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\n0\u001d\"\u0004\b\u0000\u0010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0010\u0018\u00010\u000fH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lbr/com/example/network/RestfulRequestUnwrapper;", "", "()V", "defaultSuccessCodes", "", "", "makeRequestExpectingBody", "Lio/reactivex/Single;", "T", "request", "Lretrofit2/Response;", "successCodes", "", "errorCodes", "errorBodyExpected", "Lkotlin/reflect/KClass;", "", "(Lio/reactivex/Single;[Ljava/lang/Integer;[Ljava/lang/Integer;Lkotlin/reflect/KClass;)Lio/reactivex/Single;", "makeRequestExpectingEmptyBody", "Lio/reactivex/Completable;", "(Lio/reactivex/Single;[Ljava/lang/Integer;[Ljava/lang/Integer;Lkotlin/reflect/KClass;)Lio/reactivex/Completable;", "reduceSuccessCodes", "", "values", "([Ljava/lang/Integer;)Ljava/util/Set;", "resolveExceptionError", "response", "clazz", "verifyRequestException", "Lio/reactivex/SingleTransformer;", "verifyResponseException", "network_debug"})
public final class RestfulRequestUnwrapper {
    private final java.util.Set<java.lang.Integer> defaultSuccessCodes = null;
    
    public RestfulRequestUnwrapper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>io.reactivex.Single<T> makeRequestExpectingBody(@org.jetbrains.annotations.Nullable()
    io.reactivex.Single<retrofit2.Response<T>> request, @org.jetbrains.annotations.Nullable()
    java.lang.Integer[] successCodes, @org.jetbrains.annotations.Nullable()
    java.lang.Integer[] errorCodes, @org.jetbrains.annotations.Nullable()
    kotlin.reflect.KClass<? extends java.lang.Throwable> errorBodyExpected) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>io.reactivex.Completable makeRequestExpectingEmptyBody(@org.jetbrains.annotations.Nullable()
    io.reactivex.Single<retrofit2.Response<T>> request, @org.jetbrains.annotations.Nullable()
    java.lang.Integer[] successCodes, @org.jetbrains.annotations.Nullable()
    java.lang.Integer[] errorCodes, @org.jetbrains.annotations.Nullable()
    kotlin.reflect.KClass<? extends java.lang.Throwable> errorBodyExpected) {
        return null;
    }
    
    private final <T extends java.lang.Object>io.reactivex.SingleTransformer<retrofit2.Response<T>, retrofit2.Response<T>> verifyRequestException() {
        return null;
    }
    
    private final <T extends java.lang.Object>io.reactivex.SingleTransformer<retrofit2.Response<T>, retrofit2.Response<T>> verifyResponseException(java.util.Set<java.lang.Integer> successCodes, java.util.Set<java.lang.Integer> errorCodes, kotlin.reflect.KClass<? extends java.lang.Throwable> errorBodyExpected) {
        return null;
    }
    
    private final <T extends java.lang.Object>java.lang.Throwable resolveExceptionError(retrofit2.Response<T> response, kotlin.reflect.KClass<? extends java.lang.Throwable> clazz) {
        return null;
    }
    
    private final java.util.Set<java.lang.Integer> reduceSuccessCodes(java.lang.Integer[] values) {
        return null;
    }
}