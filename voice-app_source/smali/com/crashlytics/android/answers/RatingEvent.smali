.class public Lcom/crashlytics/android/answers/RatingEvent;
.super Lcom/crashlytics/android/answers/PredefinedEvent;
.source "RatingEvent.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/crashlytics/android/answers/PredefinedEvent",
        "<",
        "Lcom/crashlytics/android/answers/RatingEvent;",
        ">;"
    }
.end annotation


# static fields
.field static final CONTENT_ID_ATTRIBUTE:Ljava/lang/String; = "contentId"

.field static final CONTENT_NAME_ATTRIBUTE:Ljava/lang/String; = "contentName"

.field static final CONTENT_TYPE_ATTRIBUTE:Ljava/lang/String; = "contentType"

.field static final RATING_ATTRIBUTE:Ljava/lang/String; = "rating"

.field static final TYPE:Ljava/lang/String; = "rating"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Lcom/crashlytics/android/answers/PredefinedEvent;-><init>()V

    return-void
.end method


# virtual methods
.method getPredefinedType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 61
    const-string v0, "rating"

    return-object v0
.end method

.method public putContentId(Ljava/lang/String;)Lcom/crashlytics/android/answers/RatingEvent;
    .locals 2
    .param p1, "contentId"    # Ljava/lang/String;

    .prologue
    .line 22
    iget-object v0, p0, Lcom/crashlytics/android/answers/RatingEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v1, "contentId"

    invoke-virtual {v0, v1, p1}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    return-object p0
.end method

.method public putContentName(Ljava/lang/String;)Lcom/crashlytics/android/answers/RatingEvent;
    .locals 2
    .param p1, "contentName"    # Ljava/lang/String;

    .prologue
    .line 33
    iget-object v0, p0, Lcom/crashlytics/android/answers/RatingEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v1, "contentName"

    invoke-virtual {v0, v1, p1}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    return-object p0
.end method

.method public putContentType(Ljava/lang/String;)Lcom/crashlytics/android/answers/RatingEvent;
    .locals 2
    .param p1, "contentType"    # Ljava/lang/String;

    .prologue
    .line 44
    iget-object v0, p0, Lcom/crashlytics/android/answers/RatingEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v1, "contentType"

    invoke-virtual {v0, v1, p1}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    return-object p0
.end method

.method public putRating(I)Lcom/crashlytics/android/answers/RatingEvent;
    .locals 3
    .param p1, "rating"    # I

    .prologue
    .line 55
    iget-object v0, p0, Lcom/crashlytics/android/answers/RatingEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v1, "rating"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/Number;)V

    .line 56
    return-object p0
.end method
