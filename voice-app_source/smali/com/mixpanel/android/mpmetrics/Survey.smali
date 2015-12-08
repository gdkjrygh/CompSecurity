.class public Lcom/mixpanel/android/mpmetrics/Survey;
.super Ljava/lang/Object;
.source "Survey.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/mpmetrics/Survey$Question;,
        Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;
    }
.end annotation


# static fields
.field public static CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/mixpanel/android/mpmetrics/Survey;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mCollectionId:I

.field private final mDescription:Lorg/json/JSONObject;

.field private final mId:I

.field private final mQuestions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/mpmetrics/Survey$Question;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 21
    new-instance v0, Lcom/mixpanel/android/mpmetrics/Survey$1;

    invoke-direct {v0}, Lcom/mixpanel/android/mpmetrics/Survey$1;-><init>()V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/Survey;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 39
    return-void
.end method

.method constructor <init>(Lorg/json/JSONObject;)V
    .locals 9
    .param p1, "description"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/mpmetrics/BadDecideObjectException;
        }
    .end annotation

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    :try_start_0
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/Survey;->mDescription:Lorg/json/JSONObject;

    .line 44
    const-string v7, "id"

    invoke-virtual {p1, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v7

    iput v7, p0, Lcom/mixpanel/android/mpmetrics/Survey;->mId:I

    .line 45
    const-string v7, "collections"

    invoke-virtual {p1, v7}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 46
    .local v1, "collectionsJArray":Lorg/json/JSONArray;
    const/4 v7, 0x0

    invoke-virtual {v1, v7}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    .line 47
    .local v0, "collection0":Lorg/json/JSONObject;
    const-string v7, "id"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v7

    iput v7, p0, Lcom/mixpanel/android/mpmetrics/Survey;->mCollectionId:I

    .line 49
    const-string v7, "questions"

    invoke-virtual {p1, v7}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    .line 50
    .local v5, "questionsJArray":Lorg/json/JSONArray;
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v7

    if-nez v7, :cond_0

    .line 51
    new-instance v7, Lcom/mixpanel/android/mpmetrics/BadDecideObjectException;

    const-string v8, "Survey has no questions."

    invoke-direct {v7, v8}, Lcom/mixpanel/android/mpmetrics/BadDecideObjectException;-><init>(Ljava/lang/String;)V

    throw v7
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .end local v0    # "collection0":Lorg/json/JSONObject;
    .end local v1    # "collectionsJArray":Lorg/json/JSONArray;
    .end local v5    # "questionsJArray":Lorg/json/JSONArray;
    :catch_0
    move-exception v2

    .line 60
    .local v2, "e":Lorg/json/JSONException;
    new-instance v7, Lcom/mixpanel/android/mpmetrics/BadDecideObjectException;

    const-string v8, "Survey JSON was unexpected or bad"

    invoke-direct {v7, v8, v2}, Lcom/mixpanel/android/mpmetrics/BadDecideObjectException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v7

    .line 53
    .end local v2    # "e":Lorg/json/JSONException;
    .restart local v0    # "collection0":Lorg/json/JSONObject;
    .restart local v1    # "collectionsJArray":Lorg/json/JSONArray;
    .restart local v5    # "questionsJArray":Lorg/json/JSONArray;
    :cond_0
    :try_start_1
    new-instance v6, Ljava/util/ArrayList;

    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 54
    .local v6, "questionsList":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/mpmetrics/Survey$Question;>;"
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v7

    if-lt v3, v7, :cond_1

    .line 58
    invoke-static {v6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    iput-object v7, p0, Lcom/mixpanel/android/mpmetrics/Survey;->mQuestions:Ljava/util/List;

    .line 62
    return-void

    .line 55
    :cond_1
    invoke-virtual {v5, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 56
    .local v4, "q":Lorg/json/JSONObject;
    new-instance v7, Lcom/mixpanel/android/mpmetrics/Survey$Question;

    const/4 v8, 0x0

    invoke-direct {v7, p0, v4, v8}, Lcom/mixpanel/android/mpmetrics/Survey$Question;-><init>(Lcom/mixpanel/android/mpmetrics/Survey;Lorg/json/JSONObject;Lcom/mixpanel/android/mpmetrics/Survey$Question;)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 54
    add-int/lit8 v3, v3, 0x1

    goto :goto_0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 82
    const/4 v0, 0x0

    return v0
.end method

.method public getCollectionId()I
    .locals 1

    .prologue
    .line 73
    iget v0, p0, Lcom/mixpanel/android/mpmetrics/Survey;->mCollectionId:I

    return v0
.end method

.method public getId()I
    .locals 1

    .prologue
    .line 69
    iget v0, p0, Lcom/mixpanel/android/mpmetrics/Survey;->mId:I

    return v0
.end method

.method public getQuestions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/mpmetrics/Survey$Question;",
            ">;"
        }
    .end annotation

    .prologue
    .line 77
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/Survey;->mQuestions:Ljava/util/List;

    return-object v0
.end method

.method toJSON()Ljava/lang/String;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/Survey;->mDescription:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    .line 87
    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/Survey;->toJSON()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 88
    return-void
.end method
