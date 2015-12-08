.class Lcom/kochava/android/tracker/Feature$TrackTask;
.super Ljava/lang/Object;
.source "Feature.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kochava/android/tracker/Feature;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "TrackTask"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 3088
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/kochava/android/tracker/Feature$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/kochava/android/tracker/Feature$1;

    .prologue
    .line 3088
    invoke-direct {p0}, Lcom/kochava/android/tracker/Feature$TrackTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 0

    .prologue
    .line 3093
    # invokes: Lcom/kochava/android/tracker/Feature;->postEvent()Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$4000()Ljava/lang/String;

    .line 3094
    return-void
.end method
