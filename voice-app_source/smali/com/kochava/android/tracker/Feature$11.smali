.class Lcom/kochava/android/tracker/Feature$11;
.super Ljava/util/TimerTask;
.source "Feature.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kochava/android/tracker/Feature;->initialHandlerActions()V
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
    .line 2632
    iput-object p1, p0, Lcom/kochava/android/tracker/Feature$11;->this$0:Lcom/kochava/android/tracker/Feature;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 0

    .prologue
    .line 2636
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->flush()V

    .line 2637
    return-void
.end method
