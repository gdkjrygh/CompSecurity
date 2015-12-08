.class public Lcom/kochava/android/util/Logging;
.super Ljava/lang/Object;
.source "Logging.java"


# static fields
.field private static final IS_KOCHAVA:Z = true

.field protected static final LOGTAG:Ljava/lang/String; = "KochavaTracker"

.field private static final REPLACE:Ljava/lang/String; = "(?<!\\.)koch(ava)?_?(?!\\.com)( (?=generated)|%20)?"

.field protected static final REQLOGTAG:Ljava/lang/String; = "KochavaRequirements"

.field static p:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 16
    const-string v0, "(?<!\\.)koch(ava)?_?(?!\\.com)( (?=generated)|%20)?"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/kochava/android/util/Logging;->p:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static Log(Ljava/lang/String;)V
    .locals 1
    .param p0, "message"    # Ljava/lang/String;

    .prologue
    .line 37
    sget-boolean v0, Lcom/kochava/android/tracker/Global;->DEBUG:Z

    if-eqz v0, :cond_0

    const-string v0, "KochavaTracker"

    invoke-static {v0, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    :cond_0
    return-void
.end method

.method public static LogError(Ljava/lang/String;)V
    .locals 1
    .param p0, "message"    # Ljava/lang/String;

    .prologue
    .line 53
    sget-boolean v0, Lcom/kochava/android/tracker/Global;->DEBUGERROR:Z

    if-eqz v0, :cond_0

    const-string v0, "KochavaTracker"

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    :cond_0
    return-void
.end method

.method public static LogRequirementsError(Ljava/lang/String;)V
    .locals 1
    .param p0, "message"    # Ljava/lang/String;

    .prologue
    .line 69
    sget-boolean v0, Lcom/kochava/android/tracker/Global;->DEBUGERROR:Z

    if-eqz v0, :cond_0

    const-string v0, "KochavaRequirements"

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    :cond_0
    return-void
.end method
