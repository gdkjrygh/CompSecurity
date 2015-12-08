.class public Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;
.super Ljava/lang/Object;
.source "UpdateDisplayState.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AnswerMap"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 276
    new-instance v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap$1;

    invoke-direct {v0}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap$1;-><init>()V

    .line 275
    sput-object v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 293
    return-void
.end method

.method public constructor <init>()V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UseSparseArrays"
        }
    .end annotation

    .prologue
    .line 244
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 245
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;->mMap:Ljava/util/HashMap;

    .line 246
    return-void
.end method


# virtual methods
.method public contentEquals(Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;)Z
    .locals 2
    .param p1, "other"    # Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;

    .prologue
    .line 257
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;->mMap:Ljava/util/HashMap;

    iget-object v1, p1, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;->mMap:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 262
    const/4 v0, 0x0

    return v0
.end method

.method public get(Ljava/lang/Integer;)Ljava/lang/String;
    .locals 1
    .param p1, "i"    # Ljava/lang/Integer;

    .prologue
    .line 253
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;->mMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public put(Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 1
    .param p1, "i"    # Ljava/lang/Integer;
    .param p2, "s"    # Ljava/lang/String;

    .prologue
    .line 249
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;->mMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 5
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    .line 267
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 268
    .local v2, "out":Landroid/os/Bundle;
    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap;->mMap:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_0

    .line 272
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 273
    return-void

    .line 268
    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 269
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/lang/String;>;"
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    .line 270
    .local v1, "keyString":Ljava/lang/String;
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v1, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method
