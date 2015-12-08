.class public Lcom/crashlytics/android/answers/LevelEndEvent;
.super Lcom/crashlytics/android/answers/PredefinedEvent;
.source "LevelEndEvent.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/crashlytics/android/answers/PredefinedEvent",
        "<",
        "Lcom/crashlytics/android/answers/LevelEndEvent;",
        ">;"
    }
.end annotation


# static fields
.field static final LEVEL_NAME_ATTRIBUTE:Ljava/lang/String; = "levelName"

.field static final SCORE_ATTRIBUTE:Ljava/lang/String; = "score"

.field static final SUCCESS_ATTRIBUTE:Ljava/lang/String; = "success"

.field static final TYPE:Ljava/lang/String; = "levelEnd"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/crashlytics/android/answers/PredefinedEvent;-><init>()V

    return-void
.end method


# virtual methods
.method getPredefinedType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 66
    const-string v0, "levelEnd"

    return-object v0
.end method

.method public putLevelName(Ljava/lang/String;)Lcom/crashlytics/android/answers/LevelEndEvent;
    .locals 2
    .param p1, "levelName"    # Ljava/lang/String;

    .prologue
    .line 37
    iget-object v0, p0, Lcom/crashlytics/android/answers/LevelEndEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v1, "levelName"

    invoke-virtual {v0, v1, p1}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    return-object p0
.end method

.method public putScore(Ljava/lang/Number;)Lcom/crashlytics/android/answers/LevelEndEvent;
    .locals 2
    .param p1, "score"    # Ljava/lang/Number;

    .prologue
    .line 48
    iget-object v0, p0, Lcom/crashlytics/android/answers/LevelEndEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v1, "score"

    invoke-virtual {v0, v1, p1}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/Number;)V

    .line 49
    return-object p0
.end method

.method public putSuccess(Z)Lcom/crashlytics/android/answers/LevelEndEvent;
    .locals 3
    .param p1, "success"    # Z

    .prologue
    .line 60
    iget-object v1, p0, Lcom/crashlytics/android/answers/LevelEndEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v2, "success"

    if-eqz p1, :cond_0

    const-string v0, "true"

    :goto_0
    invoke-virtual {v1, v2, v0}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    return-object p0

    .line 60
    :cond_0
    const-string v0, "false"

    goto :goto_0
.end method
