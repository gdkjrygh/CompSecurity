.class Lcom/mixpanel/android/mpmetrics/Tweaks$3;
.super Ljava/lang/Object;
.source "Tweaks.java"

# interfaces
.implements Lcom/mixpanel/android/mpmetrics/Tweak;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mixpanel/android/mpmetrics/Tweaks;->floatTweak(Ljava/lang/String;F)Lcom/mixpanel/android/mpmetrics/Tweak;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/mixpanel/android/mpmetrics/Tweak",
        "<",
        "Ljava/lang/Float;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mixpanel/android/mpmetrics/Tweaks;

.field private final synthetic val$tweakName:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/mixpanel/android/mpmetrics/Tweaks;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/Tweaks$3;->this$0:Lcom/mixpanel/android/mpmetrics/Tweaks;

    iput-object p2, p0, Lcom/mixpanel/android/mpmetrics/Tweaks$3;->val$tweakName:Ljava/lang/String;

    .line 229
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Float;
    .locals 4

    .prologue
    .line 232
    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/Tweaks$3;->this$0:Lcom/mixpanel/android/mpmetrics/Tweaks;

    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/Tweaks$3;->val$tweakName:Ljava/lang/String;

    # invokes: Lcom/mixpanel/android/mpmetrics/Tweaks;->getValue(Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;
    invoke-static {v2, v3}, Lcom/mixpanel/android/mpmetrics/Tweaks;->access$0(Lcom/mixpanel/android/mpmetrics/Tweaks;Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;

    move-result-object v1

    .line 233
    .local v1, "tweakValue":Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;
    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;->getNumberValue()Ljava/lang/Number;

    move-result-object v0

    .line 234
    .local v0, "result":Ljava/lang/Number;
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    return-object v2
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/Tweaks$3;->get()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
