program hello
    INCLUDE 'mpif.h'
    INTEGER err

    CALL MPI_INIT(err)
    PRINT *, "Hello world!"
    CALL MPI_FINALIZE(ERR)

end program hello
