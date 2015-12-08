.class public final Lcom/kochava/android/tracker/Feature$INPUTITEMS;
.super Ljava/lang/Object;
.source "Feature.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kochava/android/tracker/Feature;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "INPUTITEMS"
.end annotation


# static fields
.field public static final APP_LIMIT_TRACKING:Ljava/lang/String; = "app_limit_tracking"

.field public static final BIDDER_HOST:Ljava/lang/String; = "bidder_host"

.field public static final CONTROL_HOST:Ljava/lang/String; = "control_host"

.field public static final CURRENCY:Ljava/lang/String; = "currency"

.field public static final DEBUG_ON:Ljava/lang/String; = "debug"

.field public static final FLUSH_IN_BACKGROUND:Ljava/lang/String; = "flush_in_background"

.field public static final IDENTITY_LINK:Ljava/lang/String; = "identity_link"

.field public static final KOCHAVA_APP_ID:Ljava/lang/String; = "kochava_app_id"

.field public static final PARTNER_NAME:Ljava/lang/String; = "partner_name"

.field public static final REQUEST_ATTRIBUTION:Ljava/lang/String; = "request_attribution"


# instance fields
.field final synthetic this$0:Lcom/kochava/android/tracker/Feature;


# direct methods
.method private constructor <init>(Lcom/kochava/android/tracker/Feature;)V
    .locals 0
    .param p1, "this$0"    # Lcom/kochava/android/tracker/Feature;

    .prologue
    .line 3410
    iput-object p1, p0, Lcom/kochava/android/tracker/Feature$INPUTITEMS;->this$0:Lcom/kochava/android/tracker/Feature;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
