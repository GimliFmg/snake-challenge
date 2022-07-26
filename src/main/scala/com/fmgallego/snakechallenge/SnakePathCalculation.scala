package com.fmgallego.snakechallenge

import com.fmgallego.snakechallenge.Operations.{movingDown, movingLeft, movingRight, movingUp, SnakeArray}

import scala.annotation.tailrec

class SnakePathCalculation(snake: SnakeArray, boardCols: Int, depth: Int) {

  val SnakeFirstArray: SnakeArray = snake
  var Depth: Int = 0

  // TODO: WORKS ALMOST FINE, JUST NEED TO CHECK IF SNAKE IS COLLAPSING
  @tailrec
  final def getPaths(snake: SnakeArray): Option[Int] = {
      if (Snake(movingRight(snake), boardCols).isDefined) {
        if(Depth == depth) {
          println("Your achieved depth is " + Depth)
          Some(Depth)
        }
        else {
        Depth += 1
        getPaths(Snake(movingRight(snake), boardCols).get.snake)
          }
      }
      else if (Snake(movingLeft(snake), boardCols).isDefined) {
        if(Depth == depth) {
          println("Your achieved depth is " + Depth)
          Some(Depth)
        }
        else {
          Depth += 1
          getPaths(Snake(movingRight(snake), boardCols).get.snake)
        }
      }
      else if (Snake(movingDown(snake), boardCols).isDefined) {
        if(Depth == depth) {
          println("Your achieved depth is " + Depth)
          Some(Depth)
        }
        else {
          Depth += 1
          getPaths(Snake(movingRight(snake), boardCols).get.snake)
        }
      }
      else if (Snake(movingUp(snake), boardCols).isDefined) {
        if(Depth == depth) {
          println("Your achieved depth is " + Depth)
          Some(Depth)}
        else {
          Depth += 1
          getPaths(Snake(movingRight(snake), boardCols).get.snake)
        }
      }
    else {
        None
      }

  }

}