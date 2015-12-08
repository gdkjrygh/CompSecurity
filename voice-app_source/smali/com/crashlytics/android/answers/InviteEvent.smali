.class public Lcom/crashlytics/android/answers/InviteEvent;
.super Lcom/crashlytics/android/answers/PredefinedEvent;
.source "InviteEvent.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/crashlytics/android/answers/PredefinedEvent",
        "<",
        "Lcom/crashlytics/android/answers/InviteEvent;",
        ">;"
    }
.end annotation


# static fields
.field static final METHOD_ATTRIBUTE:Ljava/lang/String; = "method"

.field static final TYPE:Ljava/lang/String; = "invite"


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
    const-string v0, "invite"

    return-object v0
.end method

.method public putMethod(Ljava/lang/String;)Lcom/crashlytics/android/answers/InviteEvent;
    .locals 2
    .param p1, "inviteMethod"    # Ljava/lang/String;

    .prologue
    .line 35
    iget-object v0, p0, Lcom/crashlytics/android/answers/InviteEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v1, "method"

    invoke-virtual {v0, v1, p1}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    return-object p0
.end method
