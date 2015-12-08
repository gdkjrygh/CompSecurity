.class public abstract Lcom/crashlytics/android/answers/PredefinedEvent;
.super Lcom/crashlytics/android/answers/AnswersEvent;
.source "PredefinedEvent.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/crashlytics/android/answers/PredefinedEvent;",
        ">",
        "Lcom/crashlytics/android/answers/AnswersEvent",
        "<TT;>;"
    }
.end annotation


# instance fields
.field final predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 29
    .local p0, "this":Lcom/crashlytics/android/answers/PredefinedEvent;, "Lcom/crashlytics/android/answers/PredefinedEvent<TT;>;"
    invoke-direct {p0}, Lcom/crashlytics/android/answers/AnswersEvent;-><init>()V

    .line 30
    new-instance v0, Lcom/crashlytics/android/answers/AnswersAttributes;

    iget-object v1, p0, Lcom/crashlytics/android/answers/PredefinedEvent;->validator:Lcom/crashlytics/android/answers/AnswersEventValidator;

    invoke-direct {v0, v1}, Lcom/crashlytics/android/answers/AnswersAttributes;-><init>(Lcom/crashlytics/android/answers/AnswersEventValidator;)V

    iput-object v0, p0, Lcom/crashlytics/android/answers/PredefinedEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    .line 31
    return-void
.end method


# virtual methods
.method getPredefinedAttributes()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 36
    .local p0, "this":Lcom/crashlytics/android/answers/PredefinedEvent;, "Lcom/crashlytics/android/answers/PredefinedEvent<TT;>;"
    iget-object v0, p0, Lcom/crashlytics/android/answers/PredefinedEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    iget-object v0, v0, Lcom/crashlytics/android/answers/AnswersAttributes;->attributes:Ljava/util/Map;

    return-object v0
.end method

.method abstract getPredefinedType()Ljava/lang/String;
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 41
    .local p0, "this":Lcom/crashlytics/android/answers/PredefinedEvent;, "Lcom/crashlytics/android/answers/PredefinedEvent<TT;>;"
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "{type:\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/crashlytics/android/answers/PredefinedEvent;->getPredefinedType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", predefinedAttributes:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/crashlytics/android/answers/PredefinedEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", customAttributes:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/crashlytics/android/answers/PredefinedEvent;->customAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
