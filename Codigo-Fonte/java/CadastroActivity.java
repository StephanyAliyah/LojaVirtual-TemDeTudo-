<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/appColor1"
    tools:context=".CadastroActivity">


    <!-- Logo - Cadastro -->

    <ImageView
        android:id="@+id/imgCadastro"
        android:layout_width="150dp"
        android:layout_height="150dp"
        android:src="@drawable/cadastro_imagem"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.218" />

    <!-- Titulo -->

    <TextView
        android:id="@+id/textTitulo"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:fontFamily="monospace"
        android:text="@string/appT2Titulo"
        android:textAlignment="center"
        android:textColor="@color/appColor2"
        android:textSize="45sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.412" />

    <!-- Subtitulo - Nome -->

    <TextView
        android:id="@+id/textSubtitulo"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:fontFamily="monospace"
        android:text="@string/appT2Subtitulo"
        android:textAlignment="center"
        android:textColor="@color/appColor4"
        android:textSize="20sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.156"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.522" />

    <!-- Digitar - Nome -->

    <EditText
        android:id="@+id/editTextNome"
        android:layout_width="0dp"
        android:layout_height="60dp"
        android:layout_marginStart="30dp"
        android:layout_marginEnd="30dp"
        android:background="@color/appColor1"
        android:hint="@string/appT2Nome"
        android:inputType="textPersonName"
        android:padding="10dp"
        android:textSize="20sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.588" />


    <!-- Botão Avançar -->
    <Button
        android:id="@+id/T2BtnSet"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginStart="40dp"
        android:layout_marginEnd="40dp"
        android:backgroundTint="@color/appColor3"
        android:fontFamily="monospace"
        android:onClick="avancar"
        android:text="@string/appT2BtnSet"
        android:textAlignment="center"
        android:textColor="@color/appColor1"
        android:textSize="20sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.733" />

    <!-- Botão - Limpar -->
    <Button
        android:id="@+id/T2BtnReset"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginStart="40dp"
        android:layout_marginEnd="40dp"
        android:backgroundTint="@color/appColor3"
        android:fontFamily="monospace"
        android:onClick="limpar"
        android:text="@string/appT2BtnReset"
        android:textAlignment="center"
        android:textColor="@color/appColor1"
        android:textSize="20sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.815" />


    <!-- Botão Fechar -->

    <Button
        android:id="@+id/T2BtnClose"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginStart="40dp"
        android:layout_marginEnd="40dp"
        android:backgroundTint="@color/appColor3"
        android:fontFamily="monospace"
        android:onClick="fechar"
        android:text="@string/appT2BtnClose"
        android:textAlignment="center"
        android:textColor="@color/appColor1"
        android:textSize="20sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.898" />


</androidx.constraintlayout.widget.ConstraintLayout>

