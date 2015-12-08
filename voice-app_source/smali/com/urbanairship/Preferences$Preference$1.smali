.class Lcom/urbanairship/Preferences$Preference$1;
.super Landroid/database/ContentObserver;
.source "Preferences.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/urbanairship/Preferences$Preference;->registerObserver()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/urbanairship/Preferences$Preference;


# direct methods
.method constructor <init>(Lcom/urbanairship/Preferences$Preference;Landroid/os/Handler;)V
    .locals 0
    .param p2, "x0"    # Landroid/os/Handler;

    .prologue
    .line 305
    iput-object p1, p0, Lcom/urbanairship/Preferences$Preference$1;->this$0:Lcom/urbanairship/Preferences$Preference;

    invoke-direct {p0, p2}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public onChange(Z)V
    .locals 2
    .param p1, "selfChange"    # Z

    .prologue
    .line 308
    invoke-super {p0, p1}, Landroid/database/ContentObserver;->onChange(Z)V

    .line 310
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Preference updated:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/urbanairship/Preferences$Preference$1;->this$0:Lcom/urbanairship/Preferences$Preference;

    # getter for: Lcom/urbanairship/Preferences$Preference;->key:Ljava/lang/String;
    invoke-static {v1}, Lcom/urbanairship/Preferences$Preference;->access$000(Lcom/urbanairship/Preferences$Preference;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 311
    iget-object v0, p0, Lcom/urbanairship/Preferences$Preference$1;->this$0:Lcom/urbanairship/Preferences$Preference;

    const/4 v1, 0x0

    # setter for: Lcom/urbanairship/Preferences$Preference;->isUpdated:Z
    invoke-static {v0, v1}, Lcom/urbanairship/Preferences$Preference;->access$102(Lcom/urbanairship/Preferences$Preference;Z)Z

    .line 312
    return-void
.end method
