.class public Lcom/crashlytics/android/answers/LevelStartEvent;
.super Lcom/crashlytics/android/answers/PredefinedEvent;
.source "LevelStartEvent.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/crashlytics/android/answers/PredefinedEvent",
        "<",
        "Lcom/crashlytics/android/answers/LevelStartEvent;",
        ">;"
    }
.end annotation


# static fields
.field static final LEVEL_NAME_ATTRIBUTE:Ljava/lang/String; = "levelName"

.field static final TYPE:Ljava/lang/String; = "levelStart"


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
    .line 42
    const-string v0, "levelStart"

    return-object v0
.end method

.method public putLevelName(Ljava/lang/String;)Lcom/crashlytics/android/answers/LevelStartEvent;
    .locals 2
    .param p1, "levelName"    # Ljava/lang/String;

    .prologue
    .line 35
    iget-object v0, p0, Lcom/crashlytics/android/answers/LevelStartEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v1, "levelName"

    invoke-virtual {v0, v1, p1}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    return-object p0
.end method
