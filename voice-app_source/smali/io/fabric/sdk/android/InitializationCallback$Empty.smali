.class public Lio/fabric/sdk/android/InitializationCallback$Empty;
.super Ljava/lang/Object;
.source "InitializationCallback.java"

# interfaces
.implements Lio/fabric/sdk/android/InitializationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fabric/sdk/android/InitializationCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Empty"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/fabric/sdk/android/InitializationCallback",
        "<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lio/fabric/sdk/android/InitializationCallback$1;)V
    .locals 0
    .param p1, "x0"    # Lio/fabric/sdk/android/InitializationCallback$1;

    .prologue
    .line 37
    invoke-direct {p0}, Lio/fabric/sdk/android/InitializationCallback$Empty;-><init>()V

    return-void
.end method


# virtual methods
.method public failure(Ljava/lang/Exception;)V
    .locals 0
    .param p1, "exception"    # Ljava/lang/Exception;

    .prologue
    .line 48
    return-void
.end method

.method public success(Ljava/lang/Object;)V
    .locals 0
    .param p1, "object"    # Ljava/lang/Object;

    .prologue
    .line 43
    return-void
.end method
