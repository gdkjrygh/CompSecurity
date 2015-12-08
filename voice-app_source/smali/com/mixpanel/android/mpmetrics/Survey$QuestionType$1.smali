.class enum Lcom/mixpanel/android/mpmetrics/Survey$QuestionType$1;
.super Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;
.source "Survey.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 95
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;-><init>(Ljava/lang/String;ILcom/mixpanel/android/mpmetrics/Survey$QuestionType;)V

    .line 1
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 98
    const-string v0, "*unknown_type*"

    return-object v0
.end method
