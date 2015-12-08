.class Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap$1;
.super Ljava/lang/Object;
.source "UpdateDisplayState.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;
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
        "Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 276
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;
    .locals 6
    .param p1, "in"    # Landroid/os/Parcel;

    .prologue
    .line 279
    new-instance v2, Landroid/os/Bundle;

    const-class v4, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-direct {v2, v4}, Landroid/os/Bundle;-><init>(Ljava/lang/ClassLoader;)V

    .line 280
    .local v2, "read":Landroid/os/Bundle;
    new-instance v3, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;

    invoke-direct {v3}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;-><init>()V

    .line 281
    .local v3, "ret":Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;
    invoke-virtual {v2, p1}, Landroid/os/Bundle;->readFromParcel(Landroid/os/Parcel;)V

    .line 282
    invoke-virtual {v2}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_0

    .line 286
    return-object v3

    .line 282
    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 283
    .local v1, "kString":Ljava/lang/String;
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    .line 284
    .local v0, "kInt":Ljava/lang/Integer;
    invoke-virtual {v2, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v0, v5}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;->put(Ljava/lang/Integer;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap$1;->createFromParcel(Landroid/os/Parcel;)Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;

    move-result-object v0

    return-object v0
.end method

.method public newArray(I)[Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;
    .locals 1
    .param p1, "size"    # I

    .prologue
    .line 291
    new-array v0, p1, [Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap$1;->newArray(I)[Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;

    move-result-object v0

    return-object v0
.end method
