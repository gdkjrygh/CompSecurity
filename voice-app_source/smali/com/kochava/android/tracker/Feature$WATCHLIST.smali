.class public final Lcom/kochava/android/tracker/Feature$WATCHLIST;
.super Ljava/lang/Object;
.source "Feature.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kochava/android/tracker/Feature;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "WATCHLIST"
.end annotation


# static fields
.field public static final ADID:Ljava/lang/String; = "adid"

.field public static final APP_LIMIT_TRACKING:Ljava/lang/String; = "app_limit_tracking"

.field public static final APP_SHORT_STRING:Ljava/lang/String; = "app_short_string"

.field public static final APP_VERSION:Ljava/lang/String; = "app_version"

.field public static final DEVICE_LIMIT_TRACKING:Ljava/lang/String; = "device_limit_tracking"

.field public static final OS_VERSION:Ljava/lang/String; = "os_version"


# instance fields
.field final synthetic this$0:Lcom/kochava/android/tracker/Feature;


# direct methods
.method private constructor <init>(Lcom/kochava/android/tracker/Feature;)V
    .locals 0
    .param p1, "this$0"    # Lcom/kochava/android/tracker/Feature;

    .prologue
    .line 3431
    iput-object p1, p0, Lcom/kochava/android/tracker/Feature$WATCHLIST;->this$0:Lcom/kochava/android/tracker/Feature;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
