.class Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$1;
.super Ljava/lang/Object;
.source "UpdateDisplayState.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 375
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;
    .locals 3
    .param p1, "in"    # Landroid/os/Parcel;

    .prologue
    .line 378
    new-instance v0, Landroid/os/Bundle;

    const-class v1, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(Ljava/lang/ClassLoader;)V

    .line 379
    .local v0, "read":Landroid/os/Bundle;
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->readFromParcel(Landroid/os/Parcel;)V

    .line 380
    new-instance v1, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;-><init>(Landroid/os/Bundle;Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;)V

    return-object v1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$1;->createFromParcel(Landroid/os/Parcel;)Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;

    move-result-object v0

    return-object v0
.end method

.method public newArray(I)[Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;
    .locals 1
    .param p1, "size"    # I

    .prologue
    .line 385
    new-array v0, p1, [Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$1;->newArray(I)[Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;

    move-result-object v0

    return-object v0
.end method
