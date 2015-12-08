.class Lcom/kochava/android/tracker/Feature$9;
.super Ljava/util/TimerTask;
.source "Feature.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kochava/android/tracker/Feature;->fireEvent(Ljava/lang/String;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kochava/android/tracker/Feature;


# direct methods
.method constructor <init>(Lcom/kochava/android/tracker/Feature;)V
    .locals 0
    .param p1, "this$0"    # Lcom/kochava/android/tracker/Feature;

    .prologue
    .line 2148
    iput-object p1, p0, Lcom/kochava/android/tracker/Feature$9;->this$0:Lcom/kochava/android/tracker/Feature;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 2152
    # getter for: Lcom/kochava/android/tracker/Feature;->is_in_background:Z
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$3000()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2153
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->flush()V

    .line 2155
    :cond_0
    const/4 v0, 0x0

    # setter for: Lcom/kochava/android/tracker/Feature;->event_flush_triggered:Z
    invoke-static {v0}, Lcom/kochava/android/tracker/Feature;->access$3102(Z)Z

    .line 2156
    return-void
.end method
