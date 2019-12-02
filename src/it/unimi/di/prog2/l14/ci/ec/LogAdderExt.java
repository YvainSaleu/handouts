package it.unimi.di.prog2.l14.ci.ec;

import java.util.ArrayList;
import java.util.List;

public class LogAdderExt extends Adder {
  private final List<Integer> seen = new ArrayList<>();

  @Override
  public void add(int x) {
    seen.add(x);
    super.add(x);
  }

  @Override
  public void add(List<Integer> l) {
    seen.addAll(l);
    super.add(l);
  }

  public List<Integer> log() {
    return List.copyOf(seen);
  }
}