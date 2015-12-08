.class final Lcom/kochava/android/tracker/Feature$PRIVATEINPUTITEMS;
.super Ljava/lang/Object;
.source "Feature.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kochava/android/tracker/Feature;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "PRIVATEINPUTITEMS"
.end annotation


# static fields
.field public static final CLICK_DATA:Ljava/lang/String; = "clickData"

.field public static final FLUSH_RATE:Ljava/lang/String; = "flush_rate"

.field public static final OVERRIDE_AUTOMATIC_SESSIONS:Ljava/lang/String; = "override_automatic_sessions"

.field public static final SUPPRESS_ADID_GATHER:Ljava/lang/String; = "suppress_adid_gather"

.field public static final VERSION_EXTENSION:Ljava/lang/String; = "version_extension"


# instance fields
.field final synthetic this$0:Lcom/kochava/android/tracker/Feature;


# direct methods
.method private constructor <init>(Lcom/kochava/android/tracker/Feature;)V
    .locals 0

    .prologue
    .line 3420
    iput-object p1, p0, Lcom/kochava/android/tracker/Feature$PRIVATEINPUTITEMS;->this$0:Lcom/kochava/android/tracker/Feature;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
