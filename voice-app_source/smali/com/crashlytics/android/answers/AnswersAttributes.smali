.class Lcom/crashlytics/android/answers/AnswersAttributes;
.super Ljava/lang/Object;
.source "AnswersAttributes.java"


# instance fields
.field final attributes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final validator:Lcom/crashlytics/android/answers/AnswersEventValidator;


# direct methods
.method public constructor <init>(Lcom/crashlytics/android/answers/AnswersEventValidator;)V
    .locals 1
    .param p1, "validator"    # Lcom/crashlytics/android/answers/AnswersEventValidator;

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/crashlytics/android/answers/AnswersAttributes;->attributes:Ljava/util/Map;

    .line 30
    iput-object p1, p0, Lcom/crashlytics/android/answers/AnswersAttributes;->validator:Lcom/crashlytics/android/answers/AnswersEventValidator;

    .line 31
    return-void
.end method


# virtual methods
.method put(Ljava/lang/String;Ljava/lang/Number;)V
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/Number;

    .prologue
    .line 43
    iget-object v0, p0, Lcom/crashlytics/android/answers/AnswersAttributes;->validator:Lcom/crashlytics/android/answers/AnswersEventValidator;

    const-string v1, "key"

    invoke-virtual {v0, p1, v1}, Lcom/crashlytics/android/answers/AnswersEventValidator;->isNull(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/crashlytics/android/answers/AnswersAttributes;->validator:Lcom/crashlytics/android/answers/AnswersEventValidator;

    const-string v1, "value"

    invoke-virtual {v0, p2, v1}, Lcom/crashlytics/android/answers/AnswersEventValidator;->isNull(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 48
    :cond_0
    :goto_0
    return-void

    .line 46
    :cond_1
    iget-object v0, p0, Lcom/crashlytics/android/answers/AnswersAttributes;->validator:Lcom/crashlytics/android/answers/AnswersEventValidator;

    invoke-virtual {v0, p1}, Lcom/crashlytics/android/answers/AnswersEventValidator;->limitStringLength(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 47
    invoke-virtual {p0, p1, p2}, Lcom/crashlytics/android/answers/AnswersAttributes;->putAttribute(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method put(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 34
    iget-object v0, p0, Lcom/crashlytics/android/answers/AnswersAttributes;->validator:Lcom/crashlytics/android/answers/AnswersEventValidator;

    const-string v1, "key"

    invoke-virtual {v0, p1, v1}, Lcom/crashlytics/android/answers/AnswersEventValidator;->isNull(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/crashlytics/android/answers/AnswersAttributes;->validator:Lcom/crashlytics/android/answers/AnswersEventValidator;

    const-string v1, "value"

    invoke-virtual {v0, p2, v1}, Lcom/crashlytics/android/answers/AnswersEventValidator;->isNull(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 40
    :cond_0
    :goto_0
    return-void

    .line 37
    :cond_1
    iget-object v0, p0, Lcom/crashlytics/android/answers/AnswersAttributes;->validator:Lcom/crashlytics/android/answers/AnswersEventValidator;

    invoke-virtual {v0, p1}, Lcom/crashlytics/android/answers/AnswersEventValidator;->limitStringLength(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 38
    iget-object v0, p0, Lcom/crashlytics/android/answers/AnswersAttributes;->validator:Lcom/crashlytics/android/answers/AnswersEventValidator;

    invoke-virtual {v0, p2}, Lcom/crashlytics/android/answers/AnswersEventValidator;->limitStringLength(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 39
    invoke-virtual {p0, p1, p2}, Lcom/crashlytics/android/answers/AnswersAttributes;->putAttribute(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method putAttribute(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/Object;

    .prologue
    .line 55
    iget-object v0, p0, Lcom/crashlytics/android/answers/AnswersAttributes;->validator:Lcom/crashlytics/android/answers/AnswersEventValidator;

    iget-object v1, p0, Lcom/crashlytics/android/answers/AnswersAttributes;->attributes:Ljava/util/Map;

    invoke-virtual {v0, v1, p1}, Lcom/crashlytics/android/answers/AnswersEventValidator;->isFullMap(Ljava/util/Map;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 56
    iget-object v0, p0, Lcom/crashlytics/android/answers/AnswersAttributes;->attributes:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 62
    new-instance v0, Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/crashlytics/android/answers/AnswersAttributes;->attributes:Ljava/util/Map;

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
