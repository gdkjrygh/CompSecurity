.class public interface abstract Lio/fabric/sdk/android/services/network/PinningInfoProvider;
.super Ljava/lang/Object;
.source "PinningInfoProvider.java"


# static fields
.field public static final PIN_CREATION_TIME_UNDEFINED:J = -0x1L


# virtual methods
.method public abstract getKeyStorePassword()Ljava/lang/String;
.end method

.method public abstract getKeyStoreStream()Ljava/io/InputStream;
.end method

.method public abstract getPinCreationTimeInMillis()J
.end method

.method public abstract getPins()[Ljava/lang/String;
.end method
