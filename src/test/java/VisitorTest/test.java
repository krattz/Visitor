package VisitorTest;

import sun.reflect.generics.tree.*;
import sun.reflect.generics.visitor.Visitor;

public class test {
    Visitor visitor = new Visitor() {
        @Override
        public void visitClassSignature(ClassSignature classSignature) {

        }

        @Override
        public void visitMethodTypeSignature(MethodTypeSignature methodTypeSignature) {

        }

        @Override
        public Object getResult() {
            return null;
        }

        @Override
        public void visitFormalTypeParameter(FormalTypeParameter formalTypeParameter) {

        }

        @Override
        public void visitClassTypeSignature(ClassTypeSignature classTypeSignature) {

        }

        @Override
        public void visitArrayTypeSignature(ArrayTypeSignature arrayTypeSignature) {

        }

        @Override
        public void visitTypeVariableSignature(TypeVariableSignature typeVariableSignature) {

        }

        @Override
        public void visitWildcard(Wildcard wildcard) {

        }

        @Override
        public void visitSimpleClassTypeSignature(SimpleClassTypeSignature simpleClassTypeSignature) {

        }

        @Override
        public void visitBottomSignature(BottomSignature bottomSignature) {

        }

        @Override
        public void visitByteSignature(ByteSignature byteSignature) {

        }

        @Override
        public void visitBooleanSignature(BooleanSignature booleanSignature) {

        }

        @Override
        public void visitShortSignature(ShortSignature shortSignature) {

        }

        @Override
        public void visitCharSignature(CharSignature charSignature) {

        }

        @Override
        public void visitIntSignature(IntSignature intSignature) {

        }

        @Override
        public void visitLongSignature(LongSignature longSignature) {

        }

        @Override
        public void visitFloatSignature(FloatSignature floatSignature) {

        }

        @Override
        public void visitDoubleSignature(DoubleSignature doubleSignature) {

        }

        @Override
        public void visitVoidDescriptor(VoidDescriptor voidDescriptor) {

        }
    };
}
