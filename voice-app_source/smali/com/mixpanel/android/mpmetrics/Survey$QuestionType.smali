.class public enum Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;
.super Ljava/lang/Enum;
.source "Survey.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/mpmetrics/Survey;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = "QuestionType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic ENUM$VALUES:[Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;

.field public static final enum MULTIPLE_CHOICE:Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;

.field public static final enum TEXT:Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;

.field public static final enum UNKNOWN:Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 95
    new-instance v0, Lcom/mixpanel/android/mpmetrics/Survey$QuestionType$1;

    const-string v1, "UNKNOWN"

    invoke-direct {v0, v1, v2}, Lcom/mixpanel/android/mpmetrics/Survey$QuestionType$1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;->UNKNOWN:Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;

    .line 101
    new-instance v0, Lcom/mixpanel/android/mpmetrics/Survey$QuestionType$2;

    const-string v1, "MULTIPLE_CHOICE"

    invoke-direct {v0, v1, v3}, Lcom/mixpanel/android/mpmetrics/Survey$QuestionType$2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;->MULTIPLE_CHOICE:Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;

    .line 107
    new-instance v0, Lcom/mixpanel/android/mpmetrics/Survey$QuestionType$3;

    const-string v1, "TEXT"

    invoke-direct {v0, v1, v4}, Lcom/mixpanel/android/mpmetrics/Survey$QuestionType$3;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;->TEXT:Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;

    .line 94
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;

    sget-object v1, Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;->UNKNOWN:Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;->MULTIPLE_CHOICE:Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;->TEXT:Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;

    aput-object v1, v0, v4

    sput-object v0, Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;->ENUM$VALUES:[Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 94
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/mixpanel/android/mpmetrics/Survey$QuestionType;)V
    .locals 0

    .prologue
    .line 94
    invoke-direct {p0, p1, p2}, Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;

    return-object v0
.end method

.method public static values()[Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;->ENUM$VALUES:[Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;

    array-length v1, v0

    new-array v2, v1, [Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
