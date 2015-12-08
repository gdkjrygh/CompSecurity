.class public Lcom/crashlytics/android/answers/SignUpEvent;
.super Lcom/crashlytics/android/answers/PredefinedEvent;
.source "SignUpEvent.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/crashlytics/android/answers/PredefinedEvent",
        "<",
        "Lcom/crashlytics/android/answers/SignUpEvent;",
        ">;"
    }
.end annotation


# static fields
.field static final METHOD_ATTRIBUTE:Ljava/lang/String; = "method"

.field static final SUCCESS_ATTRIBUTE:Ljava/lang/String; = "success"

.field static final TYPE:Ljava/lang/String; = "signUp"


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
    .line 54
    const-string v0, "signUp"

    return-object v0
.end method

.method public putMethod(Ljava/lang/String;)Lcom/crashlytics/android/answers/SignUpEvent;
    .locals 2
    .param p1, "signUpMethod"    # Ljava/lang/String;

    .prologue
    .line 36
    iget-object v0, p0, Lcom/crashlytics/android/answers/SignUpEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v1, "method"

    invoke-virtual {v0, v1, p1}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    return-object p0
.end method

.method public putSuccess(Z)Lcom/crashlytics/android/answers/SignUpEvent;
    .locals 3
    .param p1, "signUpSucceeded"    # Z

    .prologue
    .line 48
    iget-object v0, p0, Lcom/crashlytics/android/answers/SignUpEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v1, "success"

    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    return-object p0
.end method
