.class final Lcom/google/android/gms/internal/zzkg$zzb;
.super Landroid/graphics/drawable/Drawable$ConstantState;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzkg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "zzb"
.end annotation


# instance fields
.field zzZD:I

.field zzZE:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzkg$zzb;)V
    .locals 1

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    if-eqz p1, :cond_0

    iget v0, p1, Lcom/google/android/gms/internal/zzkg$zzb;->zzZD:I

    iput v0, p0, Lcom/google/android/gms/internal/zzkg$zzb;->zzZD:I

    iget v0, p1, Lcom/google/android/gms/internal/zzkg$zzb;->zzZE:I

    iput v0, p0, Lcom/google/android/gms/internal/zzkg$zzb;->zzZE:I

    :cond_0
    return-void
.end method


# virtual methods
.method public getChangingConfigurations()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/zzkg$zzb;->zzZD:I

    return v0
.end method

.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/zzkg;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzkg;-><init>(Lcom/google/android/gms/internal/zzkg$zzb;)V

    return-object v0
.end method
