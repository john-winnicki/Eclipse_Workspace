program my_first_program
    implicit none
    !Purpose:
    !To solve for the hypotenuse of a triangle given 2 other sides

    REAL :: a, b, hypotenuse !Sides of the right triangle

    WRITE(*,*) "Input a side of the triangle: "
    READ(*,*) a !Get side of the triangle

    WRITE(*,*) "Input another side of the triangle: "
    READ(*,*) b !Get other side of the triangle

    hypotenuse = SQRT(a**2 + b**2)

    WRITE(*,*) "Hypotenuse is: ", hypotenuse

end program my_first_program
