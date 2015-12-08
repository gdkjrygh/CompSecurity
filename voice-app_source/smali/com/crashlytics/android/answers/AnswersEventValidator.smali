.class Lcom/crashlytics/android/answers/AnswersEventValidator;
.super Ljava/lang/Object;
.source "AnswersEventValidator.java"


# instance fields
.field failFast:Z

.field final maxNumAttributes:I

.field final maxStringLength:I


# direct methods
.method public constructor <init>(IIZ)V
    .locals 0
    .param p1, "maxNumAttributes"    # I
    .param p2, "maxStringLength"    # I
    .param p3, "failFast"    # Z

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput p1, p0, Lcom/crashlytics/android/answers/AnswersEventValidator;->maxNumAttributes:I

    .line 27
    iput p2, p0, Lcom/crashlytics/android/answers/AnswersEventValidator;->maxStringLength:I

    .line 28
    iput-boolean p3, p0, Lcom/crashlytics/android/answers/AnswersEventValidator;->failFast:Z

    .line 29
    return-void
.end method

.method private logOrThrowException(Ljava/lang/RuntimeException;)V
    .locals 3
    .param p1, "ex"    # Ljava/lang/RuntimeException;

    .prologue
    .line 72
    iget-boolean v0, p0, Lcom/crashlytics/android/answers/AnswersEventValidator;->failFast:Z

    if-eqz v0, :cond_0

    .line 73
    throw p1

    .line 75
    :cond_0
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v0

    const-string v1, "Answers"

    const-string v2, "Invalid user input detected"

    invoke-interface {v0, v1, v2, p1}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 77
    return-void
.end method


# virtual methods
.method public isFullMap(Ljava/util/Map;Ljava/lang/String;)Z
    .locals 7
    .param p2, "key"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")Z"
        }
    .end annotation

    .prologue
    .local p1, "attributeMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 59
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v3

    iget v4, p0, Lcom/crashlytics/android/answers/AnswersEventValidator;->maxNumAttributes:I

    if-lt v3, v4, :cond_0

    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 60
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "Limit of %d attributes reached, skipping attribute"

    new-array v5, v1, [Ljava/lang/Object;

    iget v6, p0, Lcom/crashlytics/android/answers/AnswersEventValidator;->maxNumAttributes:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v2

    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 62
    .local v0, "message":Ljava/lang/String;
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v2}, Lcom/crashlytics/android/answers/AnswersEventValidator;->logOrThrowException(Ljava/lang/RuntimeException;)V

    .line 65
    .end local v0    # "message":Ljava/lang/String;
    :goto_0
    return v1

    :cond_0
    move v1, v2

    goto :goto_0
.end method

.method public isNull(Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 3
    .param p1, "object"    # Ljava/lang/Object;
    .param p2, "paramName"    # Ljava/lang/String;

    .prologue
    .line 48
    if-nez p1, :cond_0

    .line 49
    new-instance v0, Ljava/lang/NullPointerException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " must not be null"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/crashlytics/android/answers/AnswersEventValidator;->logOrThrowException(Ljava/lang/RuntimeException;)V

    .line 50
    const/4 v0, 0x1

    .line 52
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public limitStringLength(Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    const/4 v5, 0x0

    .line 35
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    iget v2, p0, Lcom/crashlytics/android/answers/AnswersEventValidator;->maxStringLength:I

    if-le v1, v2, :cond_0

    .line 36
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "String is too long, truncating to %d characters"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget v4, p0, Lcom/crashlytics/android/answers/AnswersEventValidator;->maxStringLength:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 38
    .local v0, "message":Ljava/lang/String;
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v1}, Lcom/crashlytics/android/answers/AnswersEventValidator;->logOrThrowException(Ljava/lang/RuntimeException;)V

    .line 39
    iget v1, p0, Lcom/crashlytics/android/answers/AnswersEventValidator;->maxStringLength:I

    invoke-virtual {p1, v5, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 41
    .end local v0    # "message":Ljava/lang/String;
    .end local p1    # "value":Ljava/lang/String;
    :cond_0
    return-object p1
.end method
