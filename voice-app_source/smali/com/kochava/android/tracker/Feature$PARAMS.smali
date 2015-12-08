.class public final Lcom/kochava/android/tracker/Feature$PARAMS;
.super Ljava/lang/Object;
.source "Feature.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kochava/android/tracker/Feature;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "PARAMS"
.end annotation


# static fields
.field public static final ADID:Ljava/lang/String; = "adid"

.field public static final ANDROID_ID:Ljava/lang/String; = "android_id"

.field public static final FB_ATTRIBUTION_ID:Ljava/lang/String; = "fb_attribution_id"

.field public static final IMEI:Ljava/lang/String; = "imei"

.field public static final MAC:Ljava/lang/String; = "mac"

.field public static final ODIN:Ljava/lang/String; = "odin"

.field public static final OPEN_UDID:Ljava/lang/String; = "open_udid"


# instance fields
.field final synthetic this$0:Lcom/kochava/android/tracker/Feature;


# direct methods
.method private constructor <init>(Lcom/kochava/android/tracker/Feature;)V
    .locals 0
    .param p1, "this$0"    # Lcom/kochava/android/tracker/Feature;

    .prologue
    .line 3395
    iput-object p1, p0, Lcom/kochava/android/tracker/Feature$PARAMS;->this$0:Lcom/kochava/android/tracker/Feature;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
