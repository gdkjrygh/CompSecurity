.class public Lcom/crashlytics/android/answers/ContentViewEvent;
.super Lcom/crashlytics/android/answers/PredefinedEvent;
.source "ContentViewEvent.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/crashlytics/android/answers/PredefinedEvent",
        "<",
        "Lcom/crashlytics/android/answers/ContentViewEvent;",
        ">;"
    }
.end annotation


# static fields
.field static final CONTENT_ID_ATTRIBUTE:Ljava/lang/String; = "contentId"

.field static final CONTENT_NAME_ATTRIBUTE:Ljava/lang/String; = "contentName"

.field static final CONTENT_TYPE_ATTRIBUTE:Ljava/lang/String; = "contentType"

.field static final TYPE:Ljava/lang/String; = "contentView"


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
    .line 49
    const-string v0, "contentView"

    return-object v0
.end method

.method public putContentId(Ljava/lang/String;)Lcom/crashlytics/android/answers/ContentViewEvent;
    .locals 2
    .param p1, "contentId"    # Ljava/lang/String;

    .prologue
    .line 21
    iget-object v0, p0, Lcom/crashlytics/android/answers/ContentViewEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v1, "contentId"

    invoke-virtual {v0, v1, p1}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    return-object p0
.end method

.method public putContentName(Ljava/lang/String;)Lcom/crashlytics/android/answers/ContentViewEvent;
    .locals 2
    .param p1, "contentName"    # Ljava/lang/String;

    .prologue
    .line 32
    iget-object v0, p0, Lcom/crashlytics/android/answers/ContentViewEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v1, "contentName"

    invoke-virtual {v0, v1, p1}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    return-object p0
.end method

.method public putContentType(Ljava/lang/String;)Lcom/crashlytics/android/answers/ContentViewEvent;
    .locals 2
    .param p1, "contentType"    # Ljava/lang/String;

    .prologue
    .line 43
    iget-object v0, p0, Lcom/crashlytics/android/answers/ContentViewEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v1, "contentType"

    invoke-virtual {v0, v1, p1}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    return-object p0
.end method
