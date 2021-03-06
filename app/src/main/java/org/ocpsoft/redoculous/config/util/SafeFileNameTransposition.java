package org.ocpsoft.redoculous.config.util;

import org.ocpsoft.rewrite.context.EvaluationContext;
import org.ocpsoft.rewrite.event.Rewrite;
import org.ocpsoft.rewrite.param.Transposition;

public final class SafeFileNameTransposition implements Transposition<String>
{
   @Override
   public String transpose(Rewrite event, EvaluationContext context, String value)
   {
      return toSafeFilename(value);
   }

   public static String toSafeFilename(String value)
   {
      return value.replaceAll("[/?<>\\\\:*|\"]", "");
   }

}